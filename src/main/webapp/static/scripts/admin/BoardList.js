
(function ($) {
    var $s = $.SchoolMagic;
    $(document).ready(function () {
        $.jgrid.defaults.width = 780;
        $.jgrid.defaults.responsive = true;
        $.jgrid.defaults.styleUI = 'Bootstrap';
        BoardList.bindGrid();
    });
    $s.page.BoardList = {
        URL: {
            gridUrl: "",
            editUrl: "",
            deleteUrl: ""
        },
        messages: {
            deleteErrorMessage: ""
        },
        editLink: function (cellValue, options, rowdata, action) {
            return "<a href='" + BoardList.editUrl + "?id=" + options["rowId"] + "' class='glyphicon glyphicon-pencil' ></a>";
        },
        deleteLink: function (cellValue, options, rowdata, action) {
            return "<a href='javascript:BoardList.deleteRecord(" + options["rowId"] + ")' class='glyphicon glyphicon-remove'></a>";
        },
        deleteRecord: function (id) {
            var timer = null;
            var result = confirm("Are you sure you Want to delete?");
            if (result == true) {
                var msg = $("#error-message");
                msg.html('');
                $.ajax({
                    url: BoardList.deleteUrl,
                    dataType: "json",
                    type: "DELETE",
                    contentType: 'application/json; charset=utf-8',
                    data: JSON.stringify({ id: id }),
                    async: true,
                    processData: false,
                    cache: false,
                    success: function (data) {
                        if (data.IsSuccessful)
                            window.location.reload();
                        else {
                            clearTimeout(timer);
                            msg.html(data.Message); msg.show('fast');
                            timer = setTimeout(function () {
                                msg.hide('slow');
                            }, BoardList.msgTimeOut);
                            alert(BoardList.messages.deleteErrorMessage);
                        }
                    },
                    error: function (xhr) {
                        alert('error');
                    }
                });


            }
        },
        bindGrid: function () {
            $('#tblJQGrid').jqGrid(
            {
                url: BoardList.gridUrl,
                datatype: "json",
                page: 1,
                contentType: 'application/json',
                colModel: [
                {
                    label: "Board Id",
                    name: 'BoardId',
                    key: true,
                    hidden: true,
                    width: 75,
                    search: false,
                },
                { label: "Board Name", name: 'Board Name', index: 'BoardName', width: 150, searchoptions: { sopt: ["cn", "nc", "bw", "bn", "ew", "en"] } },
                { label: "Board Display Name", name: 'Board Display Name', index: 'BoardDisplayName', width: 180 },
                { label: "Board Order", name: 'Board OrderNo', index: 'Board Order No', width: 220, searchoptions: { sopt: ["cn", "nc", "bw", "bn", "ew", "en"] } },

                 { label: "Edit", name: 'Edit', search: false, index: 'BoardId', width: 55, sortable: false, formatter: BoardList.editLink, align: 'center' },
                { label: "Delete", name: 'Delete', search: false, index: 'BoardId', width: 55, sortable: false, formatter: BoardList.deleteLink, align: 'center' },
                ], rowNum: 10,
                loadonce: true,
                viewrecords: true,
                width: 780,
                height: 250,
                pager: "#jqGridPager",
                rownumbers: true, rownumWidth: 25,
            });
            $('#tblJQGrid').jqGrid('filterToolbar', {
                // JSON stringify all data from search, including search toolbar operators
                stringResult: true,
                // instuct the grid toolbar to show the search options
                searchOperators: true
            });

        }
    };
})(jQuery);

var BoardList = jQuery.SchoolMagic.page.BoardList;
