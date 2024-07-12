(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    (* Starting position of clipboard selection [x,y] *)
    start: int32 list;
    (* Ending position of clipboard selection [x,y] *)
    stop: int32 list;
    (* Clipboard data *)
    data: string option [@default None];
    (* Clipboard type *)
    _type: Enums.clipboardpayload_type option [@default None];
    context: Clipboard_payload_context.t option [@default None];
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    start = [];
    stop = [];
    data = None;
    _type = None;
    context = None;
}

