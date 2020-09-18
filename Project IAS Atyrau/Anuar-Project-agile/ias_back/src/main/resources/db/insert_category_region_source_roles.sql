
insert into category(name) values('Здравоохранение');
insert into category(name) values('Культура');
insert into category(name) values('Спорт');
insert into category(name) values('Дороги');
insert into category(name) values('Жилье и ИКИ');
insert into category(name) values('Энергетика и ЖКХ');
insert into category(name) values('Водоснабжение');
insert into category(name) values('Благоустройство');
insert into category(name) values('ЧС и Правоохранительные органы');
insert into category(name) values('Окружающая среда');
insert into category(name) values('Коммунальные объекты');
commit;


insert into region(name) values('Кызылкогинский');
insert into region(name) values('Жылыойский');
insert into region(name) values('г.Атырау');
insert into region(name) values('Индерский');
insert into region(name) values('Махамбетский');
insert into region(name) values('Курмангазинский');
insert into region(name) values('Исатайский');
insert into region(name) values('Макатский');
commit;


insert into source(name) values('Республиканский');
insert into source(name) values('Местный');
insert into source(name) values('Другое');
commit;




insert into roles(name) values('ROLE_ADMIN');
insert into roles(name) values('ROLE_USER');
commit;

