CREATE TABLE `shoppingmall`.`product` (
      `id` BIGINT NOT NULL AUTO_INCREMENT,
      `category` VARCHAR(255) NULL,
      `sub_category` VARCHAR(255) NULL,
      `consumer_type` VARCHAR(255) NULL,
      `title` VARCHAR(255) NULL,
      `price` INT NULL,
      `stock` INT NULL,
      `description` VARCHAR(255) NULL,
      `size` VARCHAR(255) NULL,
      `color` VARCHAR(255) NULL,
      `thumbnail_image_path` VARCHAR(255) NULL,
      `created_at` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
      `updated_at` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
      PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;