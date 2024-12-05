CREATE TABLE `shoppingMall`.`arrivals`
(
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL,
    `price` FLOAT NULL,
    `thumbnail_img_path` VARCHAR(400) NULL,
    `thumbnail_img_name` VARCHAR(200) NULL,
    `new_yn` VARCHAR(1) DEFAULT 'Y',
    `sale_yn` VARCHAR(1) DEFAULT 'N',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;