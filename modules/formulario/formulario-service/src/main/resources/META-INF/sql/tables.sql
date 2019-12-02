create table Form_FormEntry (
	uuid_ VARCHAR(75) null,
	formId LONG not null primary key,
	name VARCHAR(75) null,
	lastName VARCHAR(75) null,
	birthday DATE null,
	email VARCHAR(75) null,
	createDate DATE null
);