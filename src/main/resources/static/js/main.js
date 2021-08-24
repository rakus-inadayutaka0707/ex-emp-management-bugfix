'use strict'
$(function () {
  $('#mailAddress').blur(function () {
    let postUrl = 'http://localhost:8080/insertCheck'
    let inputEmail = $('#mailAddress').val()
    $.ajax({
      url: postUrl,
      type: 'post',
      dataType: 'json',
      data: {
        email: inputEmail,
      },
      async: true,
    }).done(function (data) {
      console.log(data)
      console.dir(JSON.stringify(data))
      $('#')
    })
  })
})
