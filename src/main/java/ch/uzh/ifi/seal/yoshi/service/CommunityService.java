package ch.uzh.ifi.seal.yoshi.service;

import ch.uzh.ifi.seal.yoshi.repository.CommunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CommunityService {

    private CommunityRepository repository;

    @Autowired
    public CommunityService(CommunityRepository repository) {
        this.repository = repository;
    }

}
