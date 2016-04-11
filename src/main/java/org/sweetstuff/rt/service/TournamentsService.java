package org.sweetstuff.rt.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.sweetstuff.rt.common.Uuids;
import org.sweetstuff.rt.domain.Tournament;

/**
 *
 * @author stupak
 */
@Service
public class TournamentsService {
    
    public List<Tournament> getTournaments() {
        List<Tournament> tournaments = new ArrayList<>();
        tournaments.add(new Tournament(Uuids.newId(), "Russian Drift Series"));
        return tournaments;
    }
}
