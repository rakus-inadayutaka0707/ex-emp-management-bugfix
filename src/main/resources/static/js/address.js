'use strict'
$(function () {
  $('#zipCode').blur(function () {
    let postUrl = 'http://zipcoda.net/api'
    let zipCodeValue = $('#zipCode').val()
    $.ajax({
      url: postUrl,
      dataType: 'jsonp',
      data: {
        zipcode: zipCodeValue,
      },
      async: true,
    })
      .done(function (data) {
        console.log(data)
        console.dir(JSON.stringify(data))
        $('#address').val(data.items[0].address)
      })
      .fail(function (XMLHttpRequest, textStatus, errorThrown) {
        alert('エラーが発生しました')
        console.log('XMLHttpRequest : ' + XMLHttpRequest)
        console.log('textStatus : ' + textStatus)
        console.log('errorThrown : ' + errorThrown)
      })
  })
})
