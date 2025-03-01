/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.10.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Room;
import org.openapitools.model.RoomInput;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-19T13:26:52.449819500+03:00[Europe/Moscow]", comments = "Generator version: 7.10.0")
@Validated
@Tag(name = "Rooms", description = "the Rooms API")
public interface RoomsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /rooms : Get the list of all rooms
     *
     * @return Success - List of rooms returned. (status code 200)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "roomsGet",
        summary = "Get the list of all rooms",
        tags = { "Rooms" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success - List of rooms returned.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Room.class)))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content())
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/rooms",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<Room>> roomsGet(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0 }, { \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.OK);

    }


    /**
     * POST /rooms : Add a new room
     *
     * @param roomInput  (required)
     * @return Room successfully added. (status code 201)
     *         or Invalid input. (status code 400)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "roomsPost",
        summary = "Add a new room",
        tags = { "Rooms" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Room successfully added."),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/rooms",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> roomsPost(
        @Parameter(name = "RoomInput", description = "", required = true) @Valid @RequestBody RoomInput roomInput
    ) {
        return new ResponseEntity<>(HttpStatus.CREATED);

    }


    /**
     * DELETE /rooms/{roomId} : Delete a room by ID
     *
     * @param roomId ID of the room (required)
     * @return Room successfully deleted. (status code 200)
     *         or Room not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "roomsRoomIdDelete",
        summary = "Delete a room by ID",
        tags = { "Rooms" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Room successfully deleted."),
            @ApiResponse(responseCode = "404", description = "Room not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/rooms/{roomId}"
    )
    
    default ResponseEntity<Void> roomsRoomIdDelete(
        @Parameter(name = "roomId", description = "ID of the room", required = true, in = ParameterIn.PATH) @PathVariable("roomId") Integer roomId
    ) {
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
