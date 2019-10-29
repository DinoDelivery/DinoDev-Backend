create table "order"
(
    id            serial not null
        constraint order_pkey
            primary key,
    user_id       integer
        constraint order_iduser_fkey
            references "user",
    price         integer,
    card_payment  boolean,
    delivery_date timestamp,
    address       text,
    completeness  boolean
);

alter table "order"
    owner to postgres;