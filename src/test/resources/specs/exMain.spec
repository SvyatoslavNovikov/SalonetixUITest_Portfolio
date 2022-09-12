@objects
    functional        xpath      //*[@class = 'Functional']



= Main section =
    @on clients
        functional:
            image file  extra/mainpage/images/clients.png, error 13.5%

    @on workers
        functional:
            image file  extra/mainpage/images/workers.png, error 13.5%

    @on journal
        functional:
            image file  extra/mainpage/images/journal.png, error 13.5%

    @on notification
        functional:
            image file  extra/mainpage/images/notification.png, error 13.5%

    @on online
        functional:
            image file  extra/mainpage/images/online.png, error 13.5%

    @on tips
        functional:
            image file  extra/mainpage/images/tips.png, error 13.5%