package org.sweetstuff.rt.web;

import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.web.bind.annotation.RestController;
import org.sweetstuff.rt.domain.Tournament;
import org.sweetstuff.rt.service.TournamentsService;

/**
 *
 * @author stupak
 */
@RestController
public class TournamentsController {

    private static final Logger logger = Logger.getLogger(TournamentsController.class.getName());
    
    @Autowired
    private TournamentsService tournamentsService;
    
    public TournamentsController() {
        logger.info("TournamentsController started");
    }
    
    @RequestMapping(value = "/tournaments", method = {GET})
    public List<Tournament> getTournaments() {
        return tournamentsService.getTournaments();
    }
}
