
create table `yobuma-2`.`yob_bookpro_agent`  select * from yob_bookpro_agent;

create table `yobuma-2`.`yob_bookpro_baggage` select * from yob_bookpro_baggage;

create table `yobuma-2`.`yob_bookpro_bus` select * from yob_bookpro_bus;

create table `yobuma-2`.`yob_bookpro_bus_seattemplate` select * from yob_bookpro_bus_seattemplate;

create table `yobuma-2`.`yob_bookpro_busstop` select * from yob_bookpro_busstop;

create table `yobuma-2`.`yob_bookpro_bustrip` select * from yob_bookpro_bustrip;

create table `yobuma-2`.`yob_bookpro_customer` select * from yob_bookpro_customer;

create table `yobuma-2`.`yob_bookpro_dest` select * from yob_bookpro_dest;

create table `yobuma-2`.`yob_bookpro_orders` select * from yob_bookpro_orders;

create table `yobuma-2`.`yob_bookpro_passenger` select * from yob_bookpro_passenger;

create table `yobuma-2`.`yob_bookpro_order_request` select * from yob_bookpro_order_request;

create table `yobuma-2`.`yob_bookpro_orders_log` select * from yob_bookpro_orders_log;

delete from `yobuma-2`.yob_bookpro_passenger where order_id < 493564;

delete from `yobuma-2`.yob_bookpro_customer where id < 510464;

delete from `yobuma-2`.yob_bookpro_orders where id < 493564;


