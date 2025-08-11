package com.example.Tour.Package.entity;

import org.springframework.context.annotation.Primary;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="tour")

public class Tour {

          @Id
          @GeneratedValue(strategy = GenerationType.IDENTITY)
          private Long Id;

          @NotBlank(message = "Image URL cannot be empty")
          @Column(nullable = false, length = 500)
          private String image;

          @NotBlank(message = "Discount percentage is required")
          @Column(nullable = false, length = 10)
          private String discountInPercentage;

          @NotBlank(message = "Title is required")
          @Column(nullable = false, length = 200)
          private String title;

          @NotBlank(message = "Description is required")
          @Column(nullable = false, length = 500)
          private String description;

          @NotBlank(message = "Duration is required")
          @Column(nullable = false, length = 50)
          private String duration;

          @NotBlank(message = "Actual price is required")
          @Column(nullable = false, length = 20)
          private String actualPrice;

          @NotBlank(message = "Discounted price is required")
          @Column(nullable = false, length = 20)
          private String discountedPrice;

}
