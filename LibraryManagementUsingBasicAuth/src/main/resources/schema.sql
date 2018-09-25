create table book
(
   bookid long not null,
   bookname text,
   author text,
   genre text,
   isbn text,
   primary key(bookid)
);


create table user(
   userid long not null,
   email text,
   password text,
   category text,
   primary key(userid)

);
