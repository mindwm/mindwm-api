(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Clipboard_payload_context.t : Selection context
 *)

type t = {
    (* window id *)
    window: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Selection context *)
let create () : t = {
    window = None;
}
