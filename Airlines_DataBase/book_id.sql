--------------------------------------------------------
--  File created - Friday-May-24-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table BOOK_ID
--------------------------------------------------------

  CREATE TABLE "HR"."BOOK_ID" 
   (	"BOOKING_ID" NUMBER(10,0)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into HR.BOOK_ID
SET DEFINE OFF;
Insert into HR.BOOK_ID (BOOKING_ID) values (472);
Insert into HR.BOOK_ID (BOOKING_ID) values (483);
Insert into HR.BOOK_ID (BOOKING_ID) values (516);
Insert into HR.BOOK_ID (BOOKING_ID) values (527);
Insert into HR.BOOK_ID (BOOKING_ID) values (670);
Insert into HR.BOOK_ID (BOOKING_ID) values (681);
Insert into HR.BOOK_ID (BOOKING_ID) values (450);
Insert into HR.BOOK_ID (BOOKING_ID) values (461);
Insert into HR.BOOK_ID (BOOKING_ID) values (692);
Insert into HR.BOOK_ID (BOOKING_ID) values (703);
Insert into HR.BOOK_ID (BOOKING_ID) values (714);
Insert into HR.BOOK_ID (BOOKING_ID) values (725);
Insert into HR.BOOK_ID (BOOKING_ID) values (494);
Insert into HR.BOOK_ID (BOOKING_ID) values (505);
--------------------------------------------------------
--  DDL for Index FLG_BOOKING_ID
--------------------------------------------------------

  CREATE UNIQUE INDEX "HR"."FLG_BOOKING_ID" ON "HR"."BOOK_ID" ("BOOKING_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table BOOK_ID
--------------------------------------------------------

  ALTER TABLE "HR"."BOOK_ID" ADD CONSTRAINT "FLG_BOOKING_ID" UNIQUE ("BOOKING_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE;
