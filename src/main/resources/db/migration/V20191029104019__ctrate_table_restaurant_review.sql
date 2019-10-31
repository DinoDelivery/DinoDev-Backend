CREATE TABLE review_restaurant
(
    id            serial  not null
        constraint review_restaurant_pk
            primary key,
    user_id       integer not null,
    restaurant_id integer not null,
    rating        integer,
    review        varchar    not null,
    date          timestamp
);

alter table review_restaurant
    owner to postgres;

