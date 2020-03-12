### Haetaan kaikki tapahtumat

URL : /api/events/

Method : GET

Auth required : NO

Permissions required : None

Data constraints: {}

### Success Response

Code : 200 OK

Content: {[]} with 0, 1 or multiple events:

```json
{
    "eventid": 1,
    "name": "Syksyn sävel",
    "description": "Suomen luonnon ja vuodenaikojen innoittama konserttiesitys. Soittimina tusina sadeputkea ja märkä rätti",
    "price": 50.0,
    "venue": "Nipen takapiha. Kelivaraus. Poudan yllättäessä siirrymme roskakatokseen",
    "startTime": "2020-09-16T19:00:00",
    "endTime": "2020-09-16T21:00:00",
    "ticketInventory": 2
}
```