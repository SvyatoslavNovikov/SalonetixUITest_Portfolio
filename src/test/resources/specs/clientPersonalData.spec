@objects
    password       xpath      //*[@id = 'password_password']
    confirm        xpath      //*[@id = 'password_confirm']
    sendCheckbox   xpath      //*[@id = 'subscribed_check']



= Main section =
    @on password
        password:
            image file  client/personalData/password.png, error 5%

    @on confirm
        confirm:
            image file  client/personalData/confirm.png, error 5%

    @on checkboxTrue
        sendCheckbox:
            image file  client/personalData/checkboxTrue.png, error 5%

    @on checkboxFalse
        sendCheckbox:
            image file  client/personalData/checkboxFalse.png, error 5%