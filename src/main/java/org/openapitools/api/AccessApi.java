/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.10.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.AccessRight;
import org.openapitools.model.AccessRightInput;
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
@Tag(name = "Access Rights", description = "the Access Rights API")
public interface AccessApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /access/{accessId} : Delete an access right by ID
     *
     * @param accessId ID of the access right (required)
     * @return Access right successfully deleted. (status code 200)
     *         or Access right not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "accessAccessIdDelete",
        summary = "Delete an access right by ID",
        tags = { "Access Rights" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Access right successfully deleted."),
            @ApiResponse(responseCode = "404", description = "Access right not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/access/{accessId}"
    )
    
    default ResponseEntity<Void> accessAccessIdDelete(
        @Parameter(name = "accessId", description = "ID of the access right", required = true, in = ParameterIn.PATH) @PathVariable("accessId") Integer accessId
    ) {
        return new ResponseEntity<>(HttpStatus.OK);

    }


    /**
     * GET /access : Get the list of all access rights
     *
     * @return Success - List of access rights returned. (status code 200)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "accessGet",
        summary = "Get the list of all access rights",
        tags = { "Access Rights" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success - List of access rights returned.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = AccessRight.class)))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content())
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/access",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<AccessRight>> accessGet(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"personId\" : 6, \"id\" : 0, \"roomId\" : 1 }, { \"personId\" : 6, \"id\" : 0, \"roomId\" : 1 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.OK);

    }


    /**
     * POST /access : Add a new access right
     *
     * @param accessRightInput  (required)
     * @return Access right successfully added. (status code 201)
     *         or Invalid input. (status code 400)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "accessPost",
        summary = "Add a new access right",
        tags = { "Access Rights" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Access right successfully added."),
            @ApiResponse(responseCode = "400", description = "Invalid input."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/access",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> accessPost(
        @Parameter(name = "AccessRightInput", description = "", required = true) @Valid @RequestBody AccessRightInput accessRightInput
    ) {
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

}