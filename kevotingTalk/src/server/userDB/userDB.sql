/*테이블 생성*/
create table member(
	uname varchar2(30),
	uemail varchar2(30) not null primary key,
	password varchar2(30)
);

select * from member;

select uname from member where uemail='so4@gmail.com'and password='thddkfl0316@';

delete from member where uemail='songsm4@naver.com';

insert into MEMBER values('김호수','ghtnfhfp4@gmail.com','1q2w3e4r!!');
insert into MEMBER values('노수일','food8123@gmail.com','asdasd12');
insert into MEMBER values('정혜라','hrjeong@gmail.com','1234*');




/*테이블 생성*/
create table friendList(
	id number(30) not null primary key,
	userEmail varchar2(30),
	friendEmail varchar2(30),
	constraint FK_TABLE_email FOREIGN KEY(userEmail)
	REFERENCES member(uemail),
	constraint FK_TABLE_email2 FOREIGN KEY(friendEmail)
	REFERENCES member(uemail)
);

create sequence friendListseq start with 1 increment by 1;

select * from friendList;

insert into friendList values(1,'songij4@gmail.com','ghtnfhfp4@gmail.com');
insert into friendList values(2,'songij4@gmail.com','food8123@gmail.com');
insert into friendList values(3,'songij4@gmail.com','hrjeong@gmail.com');

insert into friendList values(4,'ghtnfhfp4@gmail.com','songij4@gmail.com');
insert into friendList values(5,'ghtnfhfp4@gmail.com','food8123@gmail.com');
insert into friendList values(6,'ghtnfhfp4@gmail.com','hrjeong@gmail.com');

insert into friendList values(7,'food8123@gmail.com','ghtnfhfp4@gmail.com');
insert into friendList values(8,'food8123@gmail.com','songij4@gmail.com');
insert into friendList values(9,'food8123@gmail.com','hrjeong@gmail.com');

insert into friendList values(10,'hrjeong@gmail.com','ghtnfhfp4@gmail.com');
insert into friendList values(11,'hrjeong@gmail.com','food8123@gmail.com');
insert into friendList values(12,'hrjeong@gmail.com','songij4@gmail.com');

select m.uname from MEMBER m, friendList f where m.uemail = f.friendEmail and f.userEmail = 'songij4@gmail.com';

select uemail from MEMBER where uname='송유진';
