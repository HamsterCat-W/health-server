create database IF NOT EXISTS healthmanagement;
use healthmanagement;

create table IF NOT EXISTS userInfo(
    userId varchar(255) not null,
    username varchar(255) not null,
    password varchar(255) not null ,
    email varchar(255) not null,
    tel varchar(255) not null,
    userRole boolean default false,
    userState boolean default true,
    primary key(userId)
);

create table IF NOT EXISTS diaryInfo(
    id int auto_increment,
    userId varchar(255) not null,
    diaryId varchar(255) not null,
    diaryDate timestamp,
    diaryTitle varchar(255) not null,
    diaryContent varchar(255) null,
    diaryState boolean default true,
    primary key(id)
);