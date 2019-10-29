create table restaurant
(
    id          serial not null
        constraint restaurant_pkey
            primary key,
    name        varchar,
    rating      integer,
    link        varchar,
    reviews     varchar,
    description varchar,
    cuisine     varchar,
    review      varchar,
    photo       varchar,
    long        integer,
    lat         integer,
    dish_id     integer[]
);

alter table restaurant
    owner to postgres;

