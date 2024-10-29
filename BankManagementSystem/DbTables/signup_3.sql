CREATE TABLE signup_3 (
  formno varchar(10) PRIMARY KEY,
  accountType varchar(30),
  cardNumber varchar(20),
  pinNumber varchar(30) UNIQUE,
  facility varchar(80)
); 
