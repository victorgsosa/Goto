package com.go.to.mongo.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import com.go.to.model.Site;

@PreAuthorize("hasRole('USER')")
public interface SiteRepository extends MongoRepository<Site, String> {
	
	@RestResource(path = "nearLocations", rel = "nearLocations")
	Page<Site> findByVenueLocationPositionNear(@Param("location") Point location, @Param("distance") Distance distance,
			Pageable pageable);

}
