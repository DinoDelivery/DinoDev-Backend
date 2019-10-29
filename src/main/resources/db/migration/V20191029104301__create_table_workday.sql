create table workday
(
    id            serial not null
        constraint workday_pk_2
            primary key,
    restaurant_id integer,
    weekday       varchar,
    open_hour     timestamp,
    close_hour    timestamp
);

alter table workday
    owner to postgres;