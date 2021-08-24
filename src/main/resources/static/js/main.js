'use strict'
$(function () {
  $('#confirmPassword').on('keyup', function () {
    let postUrl = 'http://localhost:8080/check'
    let inputPassword = $('#password').val()
    let inputConfirmPassword = $('#confirmPassword').val()
    $.ajax({
      url: postUrl,
      type: 'post',
      dataType: 'json',
      data: {
        password: inputPassword,
        confirmPassword: inputConfirmPassword,
      },
      async: true,
    })
      .done(function (data) {
        console.log(data)
        console.dir(JSON.stringify(data))
        if (data.confirmPasswordResult == 'パスワードが一致しました') {
          $('#adminInsertButton').prop('disabled', false)
        } else {
          $('#adminInsertButton').prop('disabled', true)
        }
        $('#confirmPasswordResult').text(data.confirmPasswordResult)
      })
      .fail(function (XMLHttpRequest, textStatus, errorThrown) {
        console.log('XMLHttpRequest : ' + XMLHttpRequest)
        console.log('textStatus : ' + textStatus)
        console.log('errorThrown : ' + errorThrown)
      })
  })
})
