CREATE TABLE IF NOT EXISTS BSB (
  BSB varchar(10) primary key,
  FI_Code varchar(100),
  Financial_Institution varchar(200),
  --  BSB_Name varchar(200),
  BSB_Address varchar(200),
  Suburb varchar(200),
  Address_State varchar(10),
  Post_Code varchar(200),
  Payment_Systems varchar(200)
);

\COPY BSB  FROM '/tmp/BSBDirectoryMar22-312.csv' DELIMITER ',' NULL '' CSV;


-- CREATE TABLE bsb ( 
--   BSB VARCHAR(10), 
--   FI_Code varchar(100),
--   Financial_Institution varchar(200),
--   --  BSB_Name varchar(200),
--   BSB_Address varchar(200),
--   Suburb varchar(200),
--   Address_State varchar(10),
--   Post_Code varchar(200),
--   Payment_Systems varchar(200),
--   PRIMARY KEY(BSB)
-- )