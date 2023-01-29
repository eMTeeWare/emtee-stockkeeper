CREATE TABLE IF NOT EXISTS `item_type`
(
    `id`                    uuid NOT NULL PRIMARY KEY,
    `description`           varchar(255),
    `gtin`                  varchar(13),
    `added_on`              timestamp
);

CREATE TABLE IF NOT EXISTS `item`
(

    `id`                    int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `type_id`               uuid NOT NULL,
    `best_before_year`      int4,
    `best_before_month`     int2,
    `best_before_day`       int2,
    `added_on`              timestamp NOT NULL,
    FOREIGN KEY (type_id)
        REFERENCES item_type(id)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
);

