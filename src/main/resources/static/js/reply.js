'use strict';

let replyIndex = {
    init: function () {
        $("#reply-btn-save").on("click", () => {
            this.replySave();
        });
    },

    replySave: function () {
        let data = {
            content: $("#reply-content").val(),
        }
        let boardId = $("#boardId").val();
        console.log(data);
        console.log(board_id);
        $.ajax({
            type: "POST",
            url: '/api/v1/board/${board_id}/reply',
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "text"
        }).done(function (res) {
            alert("댓글작성이 완료되었습니다.");
            location.href = `/board/${board_id}`;
        }).fail(function (err) {
            alert(JSON.stringify(err));
        });
    },

    replyDelete: function (board_id, reply_id) {
        $.ajax({
            type: "DELETE",
            url: `/api/v1/board/${board_id}/reply/${reply_id}`,
            dataType: "text"
        }).done(function (res) {
            alert("댓글삭제가 완료되었습니다.");
            location.href = `/board/${board_id}`;
        }).fail(function (err) {
            alert(JSON.stringify(err));
        });
    },

}
replyIndex.init();
