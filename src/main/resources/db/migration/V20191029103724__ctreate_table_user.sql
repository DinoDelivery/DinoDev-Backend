create table "user"
(
    id            serial not null
        constraint user_pkey
            primary key,
    name          varchar,
    phone_number  varchar,
    personal_code varchar
);

alter table "user"
    owner to postgres;