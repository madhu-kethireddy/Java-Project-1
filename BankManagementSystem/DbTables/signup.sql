CREATE TABLE  signup (
   formno  varchar(10) PRIMARY KEY,
   name  varchar(35) NOT NULL,
   father_name  varchar(35) NOT NULL,
   date_of_birth  varchar(30),
   gender  varchar(12),
   email  varchar(50),
   maritial_status  varchar(25),
   address  varchar(50),
   city  varchar(30),
   state  varchar(30),
   pincode  varchar(20)
);
