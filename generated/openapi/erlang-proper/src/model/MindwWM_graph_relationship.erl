-module(MindwWM_graph_relationship).

-include("MindwWM.hrl").

-export([MindwWM_graph_relationship/0]).

-export([MindwWM_graph_relationship/1]).

-export_type([MindwWM_graph_relationship/0]).

-type MindwWM_graph_relationship() ::
  [ {'id', binary() }
  | {'source', binary() }
  | {'specversion', binary() }
  | {'type', binary() }
  | {'datacontenttype', binary() }
  | {'dataschema', MindwWM_u_ri:MindwWM_u_ri() }
  | {'subject', binary() }
  | {'time', datetime() }
  | {'data', MindwWM_graph_relationship_all_of_data:MindwWM_graph_relationship_all_of_data() }
  | {'data_base64', binary() }
  ].


MindwWM_graph_relationship() ->
    MindwWM_graph_relationship([]).

MindwWM_graph_relationship(Fields) ->
  Default = [ {'id', binary(1) }
            , {'source', elements([<<"graph.relationship">>]) }
            , {'specversion', binary(1) }
            , {'type', elements([<<"created">>, <<"updated">>, <<"deleted">>]) }
            , {'datacontenttype', binary(1) }
            , {'dataschema', binary(1) }
            , {'subject', binary(1) }
            , {'time', datetime() }
            , {'data', MindwWM_graph_relationship_all_of_data:MindwWM_graph_relationship_all_of_data() }
            , {'data_base64', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

