# event-manager
### My case study for blc company


## Documentation

EventManager API lets you create new events, edit, view and delete them.

## Endpoints:


**Get All Events**

`/api/getall`

Method: `GET`

-------

**Create an Event**

`/api/create`

Method: `POST`

This endpoint excepts an event object without id

E.g. request: 

```
{
    "description": "bootcamp",
    "startDate": "2007-02-05",
    "endingDate": "2007-03-01",
    "quota": 34,
    "participant": 30
}
```

Response will contain the id of currently created event.

-----

**Edit an Event**

`/api/edit`

Method: `PUT`

E.g. request:

```
{
    "id": "1",
    "description": "zoom meeting",
    "startDate": "2004-12-05",
    "endingDate": "2005-02-15",
    "quota": 34,
    "participant": 30
}

```

This endpoint excepts an event object with id and modified datas

-----

**Delete an Event**

`/api/delete/{eventId}`

This endpoint reqires of the ID that you want to remove.