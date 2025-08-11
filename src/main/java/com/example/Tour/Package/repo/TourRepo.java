
package com.example.Tour.Package.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Tour.Package.entity.Tour;




public interface TourRepo  extends JpaRepository<Tour,Long>{

}
