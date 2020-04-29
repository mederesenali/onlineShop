use `onlineshop`;

CREATE TABLE `onlineshop`.`product` (
                                     `id` INT NOT NULL AUTO_INCREMENT,
                                     `description` VARCHAR(255) NULL,
                                     `name` VARCHAR(255) NULL,
                                     `price` INT NULL,
                                     `quantity` INT NULL,
                                     PRIMARY KEY (`id`));


