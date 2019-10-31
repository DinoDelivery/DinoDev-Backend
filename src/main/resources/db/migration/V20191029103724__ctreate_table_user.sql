create table "user"
(
    id            serial not null
        constraint user_pkey
            primary key,
    first_name varchar,
    last_name varchar,
    phone_number varchar,
    password_hash varchar,
    personal_code varchar,
    email varchar
);

alter table "user"
    owner to postgres;