insert into bank (ifsc, branch_details) values ('BARC0000185', '20, Grant Road, New Bakersville, WL - 432543');

insert into User (asid, contact_no, email_id, first_Name, last_Name) values ('1652907568063461', '+91 7323109712', 'johndoe@gmail.com', 'John', 'Doe');

insert into account (account_balance, account_type, social_id, user_id, bank_id) values(1000, 'Savings', '1652907568063461', '1', '1');

insert into Sender_Session (Id, last_LoginTS, authenticated_Flag, secure_Pin, updateTS) values ('1652907568063461', '22-11-2017', 'true', '5678', '23-11-2017');

insert into transaction (amount, date, transaction_type, account_id) values ('230.90', '12-11-2017', 'Debit', '1');
insert into transaction (amount, date, transaction_type, account_id) values ('450.00', '15-11-2017', 'Credit', '1');
insert into transaction (amount, date, transaction_type, account_id) values ('212.20', '21-11-2017', 'Debit', '1');
insert into transaction (amount, date, transaction_type, account_id) values ('650.50', '23-11-2017', 'Debit', '1');
insert into transaction (amount, date, transaction_type, account_id) values ('99.99', '24-11-2017', 'Debit', '1');