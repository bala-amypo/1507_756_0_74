
@RestController
public class LocationController {
    @Autowired
    LocationService locationservice;
    @PostMapping
    public LocationEntity add()
}