--------------------------------------------------------
--  File created - Friday-May-24-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table LOGIN
--------------------------------------------------------

  CREATE TABLE "HR"."LOGIN" 
   (	"LOGIN_ID" NUMBER(10,0), 
	"USER_NAME" VARCHAR2(60 BYTE), 
	"PASSWORD" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into HR.LOGIN
SET DEFINE OFF;
Insert into HR.LOGIN (LOGIN_ID,USER_NAME,PASSWORD) values (166,'bala@gmail.com','1234');
Insert into HR.LOGIN (LOGIN_ID,USER_NAME,PASSWORD) values (167,'ajay@gmail.com','1234');
Insert into HR.LOGIN (LOGIN_ID,USER_NAME,PASSWORD) values (168,'aravind@gmail.com','1234');
Insert into HR.LOGIN (LOGIN_ID,USER_NAME,PASSWORD) values (169,'harimano@gmail.com','1234');
Insert into HR.LOGIN (LOGIN_ID,USER_NAME,PASSWORD) values (170,'harimanosp@gmail.com','1234');
Insert into HR.LOGIN (LOGIN_ID,USER_NAME,PASSWORD) values (171,'manohari@gmail.com','1234');
Insert into HR.LOGIN (LOGIN_ID,USER_NAME,PASSWORD) values (172,'manoharisp@gmail.com','1234');
Insert into HR.LOGIN (LOGIN_ID,USER_NAME,PASSWORD) values (173,'mano@gmail.com','1234');
Insert into HR.LOGIN (LOGIN_ID,USER_NAME,PASSWORD) values (174,'spmanohari@gmail.com','1234');
--------------------------------------------------------
--  DDL for Index SYS_C004644
--------------------------------------------------------

  CREATE UNIQUE INDEX "HR"."SYS_C004644" ON "HR"."LOGIN" ("LOGIN_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table LOGIN
--------------------------------------------------------

  ALTER TABLE "HR"."LOGIN" ADD PRIMARY KEY ("LOGIN_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE;
