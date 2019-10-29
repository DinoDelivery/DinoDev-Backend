create table review_dish
(
    review_id serial  not null
        constraint review_dish_pk
            primary key,
    user_id   integer not null,
    date      timestamp,
    rating    integer,
    review    text,
    dish_id   integer
);

alter table review_dish
    owner to postgres;

