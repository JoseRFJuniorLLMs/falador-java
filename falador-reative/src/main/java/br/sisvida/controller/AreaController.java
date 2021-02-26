package br.sisvida.controller;

import br.sisvida.dto.AreaBuscaDTO;
import br.sisvida.services.AreaService;
import com.googolplex.documents.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 03/08/2020
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("area")
@RestController
public class AreaController {

    @Autowired
    AreaService areaService;

    @RequestMapping(value="/flux20", method= RequestMethod.GET)
    public ResponseEntity<List<AreaBuscaDTO>> findAll() {
        Flux<Area> listFlux = areaService.findAll();
        List<AreaBuscaDTO> listDto = listFlux.toStream()
                .sorted(Comparator.comparing(Area::getId).reversed())
                .map(AreaBuscaDTO::new)
                .limit(20)
                .collect( Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Area> streamAreaStatus() {
        return areaService.findAll().delayElements(Duration.ofSeconds(1));
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ResponseEntity<Area>> create(@RequestBody Area area) {
        return areaService.save(area)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

}
