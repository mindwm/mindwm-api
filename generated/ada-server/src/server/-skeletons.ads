--  Mindwm API
--  This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
--
--  The version of the OpenAPI document: 0.1.0
--
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.7.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

pragma Warnings (Off, "*is not referenced");
pragma Warnings (Off, "*no entities of*are referenced");
with Swagger.Servers;
with .Models;
with Security.Permissions;
package .Skeletons is
   pragma Style_Checks ("-bmrIu");
   pragma Warnings (Off, "*use clause for package*");
   use .Models;
   type Server_Type is limited interface;



   generic
      type Implementation_Type is limited new Server_Type with private;
      URI_Prefix : String := "";
   package Skeleton is

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class);

   end Skeleton;

   generic
      type Implementation_Type is limited new Server_Type with private;
      URI_Prefix : String := "";
   package Shared_Instance is

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class);


   private
      protected Server is

      private
         Impl : Implementation_Type;
      end Server;
   end Shared_Instance;

end .Skeletons;
