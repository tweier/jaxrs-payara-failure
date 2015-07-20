package com.tests.jaxrs.rest;

import com.tests.jaxrs.business.PersonServiceLocal;
import com.tests.jaxrs.domain.Person;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Stateless
@Path("/person")
public class PersonResource {

  @EJB
  private PersonServiceLocal personServiceLocal;
  
  @Path("/{id}")
  @GET
  @Produces({ APPLICATION_JSON })
  public Person read(@PathParam("id") long id) {
    return personServiceLocal.read(id);
  }

  @PUT
  @Consumes({ APPLICATION_JSON })
  @Produces({ APPLICATION_JSON })
  public Person create(Person person) {
    return personServiceLocal.create(person);
  }
  
  @POST
  @Consumes({ APPLICATION_JSON })
  @Produces({ APPLICATION_JSON })
  public Person update(Person person) {
    return personServiceLocal.update(person);
  }
  
  @Path("/{id}")
  @DELETE
  public void delete(@PathParam("id") long id) {
    personServiceLocal.delete(id);
  }
  
}
