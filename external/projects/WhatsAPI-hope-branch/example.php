<?php
require "whatsapp.class.php";

$nickname = "Jaap";
$sender = "61416905612";
$imei = "603938931484000";
$revImei = md5(strrev($imei));

$wa = new WhatsApp($sender, $revImei, $nickname);
$wa->Connect();
$wa->Login();
  
// SEND AN EMOJI TEST
$str = "Interesting  [emo]EE808A[/emo] wwooooot [emo]EE808C[/emo]";
function parsEmo($matches){
	return hex2str($matches[1]);
}

$bbcode = preg_replace_callback("#\[emo\](.+)\[\/emo\]#iUs","parsEmo",$str);
$wa->Message(time()."-1","16043135227","$bbcode");
$wa->RequestLastSeen("16043135227"); 
?>
