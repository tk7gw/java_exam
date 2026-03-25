'use strict';

//問題1
$(function () {
    console.log("瀧川真生");
});

//問題2
$(function () {
    $("#q2_btn").on("click", function () {
        $("#name").css("color", "red");
    });
});

//問題3
$(function () {
    $("#q3_btn").on("click", function () {
        let age = $("#age").val();
        alert(age);
    });
});

//問題4
$("#q4_btn").on("click", function () {
    $("#q4_btn").prop("disabled", true);
});

//問題5
$(function () {
    $("#java").hide
    $("#js").hide

    $("#select").on("chenge");
    if (value === "1") {
        $("#java").show
        $("#js").hide
    } else if (value === "2") {
        $("#java").hide
        $("#js").show
    } else {
        $("#java").hide
        $("#js").hide
    }
});
