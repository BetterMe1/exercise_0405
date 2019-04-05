create table if not exists notes(
id int primary key auto_increment comment'便签编号',
title varchar(30) unique comment'便签标题',
content varchar(1000) comment'便签内容',
is_diaplay char(1) default 0 comment'是否私密',
backup enum('黄色','红色','蓝色','绿色') comment'背景颜色',
is_call char(1) default 1 comment'是否提醒',
is_delete bit(1) comment'是否删除',
call_time datetime comment'提醒时间',
create_time datetime comment'创建时间',
modify_time timestamp comment'修改时间',
delete_time timestamp comment'删除时间',
group_id int comment'便签组编号',
foreign key (group_id) references notes_group(id));

create table if not exists notes_group(
id int primary key auto_increment comment'便签组编号',
group_name varchar(30) unique comment'便签名称',
create_time datetime comment'创建时间',
modify_time timestamp comment'修改时间',
delete_time timestamp comment'删除时间');

create table if not exists notes_share(
id int primary key auto_increment comment'分享编号',
notes_id int not null comment'便签编号',
share_mark varchar(100) comment'分享备注',
share_time datetime comment'分享时间',
delete_time datetime comment'删除时间',
foreign key (notes_id) references notes(id));