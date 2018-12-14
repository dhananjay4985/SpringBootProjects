import { Component , OnInit ,Pipe} from '@angular/core';
import * as XLSX from 'xlsx';
import { read, write, utils } from 'xlsx'
import { saveAs } from 'file-saver';
import { Template } from '../shared/models/template';
import { TemplateService } from '../services/template.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-spread-sheet',
  templateUrl: './spread-sheet.component.html',
  styleUrls: ['./spread-sheet.component.css']
})
@Pipe({
    name: "search"
})

export class SpreadSheetComponent implements OnInit {
  
  title = 'CSV Converion Tool';
  private templates: Template[]; 
  private template: Template;  
  arrayBuffer:any;
  file:File;  
  isValid: boolean = false;	
 
  constructor(private templateService: TemplateService,private router: Router) { }  
 
  ngOnInit() {
	   this.templateService.getAllTemplates().subscribe((templates)=>{
		  this.templates = templates;
	  });
  }
  
	incomingfile(event) 
	{
		this.file= event.target.files[0]; 
	}
    Upload() {
      let fileReader = new FileReader();
        fileReader.onload = (e) => {
            this.arrayBuffer = fileReader.result;
            var dataa = new Uint8Array(this.arrayBuffer);
            var arr = new Array();
            for(var i = 0; i != dataa.length; ++i) arr[i] = String.fromCharCode(dataa[i]);
            var bstr = arr.join("");
            var workbook = XLSX.read(bstr, {type:"binary"});
            var first_sheet_name = workbook.SheetNames[0];			
            var worksheet = workbook.Sheets[first_sheet_name];	
			/*this.templates = XLSX.utils.sheet_to_json(worksheet,
			{header:["krnId","area","userName","givenName","familyName","mail",
					"workPhone","mobile","middleName","homePhone","preferredLanguage",
					"gender","employeeNumber","sendWelcomeMail","antares","telios",
					"storm","serviceNow","comarch","coreTenantAdmin","beheren","clientITManager"]});*/	
						
			this.templates = XLSX.utils.sheet_to_json(worksheet,{raw:true});		
			this.templateService.addOnUpload(this.templates)
		 		.subscribe((data)=> {
				this.router.navigate(['spread-sheet']);
		 	 });		
        }
        fileReader.readAsArrayBuffer(this.file);
	}	

	exportToCSV(templates:Template[]){					
			
			var actualData = templates;		
			
			var dataa = actualData.map(row=>({				
				'"krnId"':row.krnId,
				'"Area"':row.area,
				'"userName"':row.userName,
				'"givenName"':row.givenName,
				'"familyName"':row.familyName,
				'"mail"':row.mail,
				'"workPhone"':row.workPhone,
				'"mobile"':row.mobile,
				'"middleName"':row.middleName,
				'"homePhone"':row.homePhone,
				'"preferredLanguage"':row.preferredLanguage,
				'"gender"':row.gender,
				'"employeeNumber"':row.employeeNumber,
				'"sendWelcomeMail"':row.sendWelcomeMail,
				'"Antares"':row.antares,
				'"Telios"':row.telios,
				'"Storm"':row.storm,
				'"ServiceNow"':row.serviceNow,
				'"Comarch"':row.comarch,
				'"coreTenantAdmin"':row.coreTenantAdmin,
				'"Beheren"':row.beheren,
				'"ClientITManager"':row.clientITManager
			}));
			var csvrows = [];
			//get the headers
			const replacer = (key, value) => value === null ? '' : value; 
			var  header = Object.keys(dataa[0]);			
			let csv = dataa.map(row => header.map(fieldName => JSON.stringify(row[fieldName], replacer)).join(','));
					
			csv.unshift(header.join(','));
			let csvArray = csv.join('\r\n');			
		
			//CSV conversion
 			var blob = new Blob([csvArray],{type:'text/csv'});
			var url = window.URL.createObjectURL(blob);
			var a  = document.createElement('a');
			a.setAttribute('hidden','');
			a.setAttribute('href',url);
			a.setAttribute('download','download.csv');
			document.body.appendChild(a);
			a.click();
			document.body.removeChild(a); 
	}
	newCSVRecord() {
	 let template = new Template();
	 this.templateService.setter(template);
     this.router.navigate(['add-csvrecord']);
  }

}
