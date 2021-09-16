package ru.mypodcast.mypodcast.exmapleforswagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/api")
@Api(value = "addressBook resources", description = "crud operations")
public class AddressBookResource {

    private Map<String, Contact> contacts = new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    public Contact getContact(@PathVariable String id) {
        return contacts.get(id);
    }

    @GetMapping("/all")
    @ApiOperation(value = "show all contacts", response = List.class)
    public List<Contact> getAllContacts() {
        return new ArrayList<>(contacts.values());
    }

    @PostMapping("/add")
    public Contact addContact(@RequestBody Contact contact) {
        contacts.put(contact.getId(), contact);
        return contact;

    }
}
