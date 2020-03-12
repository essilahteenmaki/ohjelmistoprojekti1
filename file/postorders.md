### Add order

URL : /api/orders/{eventid}/{typeid}/{pcs}

Method : POST

Auth required : YES (in future)


Data constraints: empty object, parameters: {eventid} {typeid} and {pcs} number of tickets

Orders orderid and tickets ticketid will be autogenerated.
timestamp for Order will be autogenerated.

Header constraints
Content-Type: application/JSON

### Success Responses

Code : 201 CREATED

```json
Content example :
{
    "orderid": 27,
    "total": 0.0,
    "timestamp": "2020-03-12T12:46:28.772+02:00"
}
```

Error Response

Condition : If parameters are missing

Code : 400 BAD REQUEST

Content example :

{
    "message": 
        "Not yet"
    
}