create table dish
(
    id          serial  not null
        constraint dishes_pkey
            primary key,
    name        varchar    not null,
    rating      integer,
    reviews     varchar,
    description varchar,
    weight      integer not null,
    type        varchar,
    photo       varchar,
    price       money,
    ingredients varchar[]
);