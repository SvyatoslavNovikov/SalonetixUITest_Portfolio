@objects
    changePhoneWindow   xpath      //*[@id = 'sms_verify']


= Main section =
    @on Chrome
        changePhoneWindow:
            image file  client/personalData/changePhoneWindow.png, error 1%